#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LEN 255

int main(int argc, char* argv[])
{

	char* c;
	char input[LEN];
	
	printf("Enter your commands here: ");	

  	fgets(input, LEN, stdin);
  	c = strtok(input, "&&");
	
	while (c != 0)
	{
		system(c);
		c = strtok(0, "&&");
 	}

	return 0;

}
