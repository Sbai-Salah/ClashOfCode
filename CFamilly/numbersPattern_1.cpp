
using namespace std;

/*
   input --> output 
    789 --> 123
	12345678 --> 45678912
	25 --> 58
	159 --> 483
	45 --> 78
*/
int main(){
    string l;
    getline(cin, l); // get the text from input and put it in the var
    for(char c:l){
        int y=c-'0'; // char to int :)
        y=y+3;
        if(y>9)y-=9;
    }

    cout<<endl;
}