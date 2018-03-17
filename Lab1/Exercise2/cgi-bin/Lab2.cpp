#include "cgi_interface.cpp"
#include <iostream>
#include <stdlib.h>

using namespace std;

class Lab2 {
    private:
		int rows;   // # rows of the table
    public:
		void setRows(int number){
			rows = number;
		}
		int getRows(void){
			return rows;
		}
};

int main()
 {
	//Creating and initialising the wrapper
	CGI_Interface *cgi=new CGI_Interface();
	
	//Loading data into the Wrapper
	int Loaded=cgi->AutoLoad();
	
	char *value=cgi->Fetch("Input");
	int rowNum = atoi( value );
	
	Lab2 temp = Lab2();
	temp.setRows(rowNum);	
	printf("Content-type: text/html\n\n");
	printf("<html><head><title>Lab Exercise 2</title></head>\n");
	printf("<table>");
	
	for(int i = 0; i < temp.getRows(); i++)
	{
		printf("<tr><td>Iteration</td><td>%d</td></tr>\n",i);
	}
	
	printf("</table>");
	printf("<h1>%d</h1>",Loaded);
	printf("</body></html>");

	return 1;
 }
 
 /*
 <html>
<head>
<title>Lab Exercise 2<title>
</head>
<body>
<table>
<tr><td>Iteration</td><td>1</td></tr>
</table>
</body>
<html>
 */