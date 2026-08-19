#include <bits/stdc++.h>
using namespace std;

using ll=long long;

ll W[200020];
ll box[200020];

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    ll N,Q,X;
    cin>>N>>Q>>X;

    vector<ll> weight(N);
    ll total=0;

    for(int i=0;i<N;i++){
        cin>>weight[i];
        total+=weight[i];
    }

    vector<ll> pref(2*N);
    pref[0]=weight[0];

    for(int i=1;i<2*N;i++){
        pref[i]+=weight[i%N]+pref[i-1];
    }

    vector<ll> res(N,0);
    vector<ll> flag(N,0);

    ll curr=0;
    ll cyclelen=1;
    ll cycle=0;
    ll start=1;

    flag[0]=1;

    for(int i=0;i<N;i++){
        res[i]+=(X/total)*N;
        ll need=X%total;

        if(need!=0){
            ll target=need;
            if(curr>0){
                target=pref[curr-1]+need;
            }
            auto it=lower_bound(pref.begin(),pref.end(),target);
            ll idx=it-pref.begin();

            res[i]+=idx-curr+1;
            curr=(idx+1)%N;
        }

        cyclelen++;

        if(flag[curr]>0){
            cycle=cyclelen-flag[curr];
            start=flag[curr];
            break;
        }

        flag[curr]=cyclelen;

    }

    while(Q--){
        ll k;
        cin>>k;

        k--;

        if(k<start-1){
            cout<<res[k]<<endl;
        }
        else{
            k=start-1+(k-(start-1))%cycle;
            cout<<res[k]<<endl;
        }
    }
}