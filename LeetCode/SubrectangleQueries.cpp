#include<iostream>
#include<vector>
using namespace std;
class SubrectangleQueries{
 public:
  vector<vector<int>> rectangle;
 SubrectangleQueries(vector<vector<int>> &rectangle){
   this->rectangle=rectangle;
 }
 
int getValue(int row, int col) {
     return rectangle[row][col];
     
}
void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
    int i,j;
   for(i=row1;i<=row2;i++)
      for(j=col1;j<=col2;j++)
         rectangle[i][j]=newValue;
   }
 void show(){
  int i,j;
  vector<int> temp;
    for(i=0;i<rectangle.size();i++){
       temp=rectangle[i];
       for(j=0;j<temp.size();j++){
         cout<<temp[j]<<" ";
       }
       temp.clear();
       cout<<endl;
    }
 }  
};
int main(){
int element,i,j,row,column;
cin>>row>>column;
vector<vector<int>> rec;
vector<int> temp;
for(i=0;i<row;i++){
    for(j=0;j<column;j++){
      cin>>element;
       temp.push_back(element);
    }
    rec.push_back(temp);
    temp.clear();
} 
SubrectangleQueries *obj=new SubrectangleQueries(rec);
obj->show();
cout<<obj->getValue(3,1)<<endl;
obj->updateSubrectangle(3,0,3,2,10);
obj->show();
cout<<obj->getValue(3,1)<<endl;
return 0;  
}