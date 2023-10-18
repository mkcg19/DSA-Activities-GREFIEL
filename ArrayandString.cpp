#include<iostream>
#include<string>

using namespace std;

int main () {
	
	int size = 5;
	string names[size];
	string address[size];
	int ages[size];
	string genders[size];
		
	for(int i = 0; i < size; i++){
			
			cout << "Enter name" << i + 1 << ": ";
			getline(cin, names[i]);
			
			cout << "Enter address" << i + 1 << ": ";
			getline(cin, address[i]);
			
			cout << "Enter age" << i + 1 << ": ";
			cin >> ages[i];
			cin.ignore();
		
			cout << "Enter gender" << i + 1 << ": ";
			getline(cin, genders[i]);
			cout << endl;
	}
	

	int index;
	cout << "Enter index (0 to " << size - 1 << ") to display data: ";
	cin >> index;
		if(index >= 0 && index < size) {
			//int index = size - 1;
			cout << "Name: " << names[index] << endl;
			cout << "Address: " << address[index] << endl;
			cout << "Age: " << ages[index] << endl;
			cout << "Gender: " << genders[index];
		}
		else{
			cout << "Index out of range." << endl;
		}	
	return 0;
		
}