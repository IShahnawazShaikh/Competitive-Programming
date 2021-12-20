 #include<iostream>
 #include<vector>
using namespace std;
 int minTimeToVisitAllPoints(vector<vector<int>>& points) {
  int i,time=0;
  vector<int> t1;
  vector<int> t2;
  for(i=0;i<points.size();i++){
     t1=points[i];
     if(i+1<points.size()){
        t2=points[i+1];
        time+=(abs(t1[0]-t2[0]) >= abs(t1[1]-t2[1])) ? abs(t1[0]-t2[0]): abs(t1[1]-t2[1]);
     }
   }
 // cout<<endl<<"time: "<<time;
 return time;
}
 int main(){
 vector<vector<int>> points;
 int x,y,i,n;	
 cout<<"Enter Number of points :"<<endl;
 cin>>n;
 for(i=0;i<n;i++){
  cin>>x>>y;
  vector<int> point;
  point.push_back(x);
  point.push_back(y);
  points.push_back(point);
 }
cout<<minTimeToVisitAllPoints(points);
 return 0;	
 }