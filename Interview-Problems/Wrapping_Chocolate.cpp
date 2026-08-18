#include <bits/stdc++.h>
using namespace std;

void gi ( vector<int> &arr, int N){
    for(int i=0;i<N;i++){
        cin >> arr[i];
    }
}

int main(){
    int C,B;
    cin >> C >> B;
    vector<int>cl(C + 1),cw(C + 1),bl(B + 1),bw(B + 1);
    gi(cl,C);gi(cw,C);gi(bl,B);gi(bw,B);

    vector<pair<int,int>> cho(C);
    vector<pair<int,int>> box(B);

    vector<tuple<int,int,int> , greater<tuple<int,int,int>>> ms;

    for(int i=1;i<=C;i++){
        ms.push_back(make_tuple(cl[i],cw[i],i));
    }
    for(int i=1;i<=B;i++){
        ms.push_back(make_tuple(bl[i],bw[i],-i));
    }
    
    multiset<int> st;

    for(auto [length, widht,type]:ms){
        if(type > 0){
            st.insert(length);
        }
        else{
            auto it = st.lower_bound(lenght);
            if(it==st.end()){
                coutn<<"No"<<endl;
                return 0;
            }
            st.erase(it);
        }
    }
    count<<"Yes"<<endl;
}