#include <stdio.h>

main() {
	FILE *fpt;
	char text[80];
	fpt=fopen("data.txt","r");
	fread(text,1,20,fpt);
	text[20]=0;
	printf("%s\n",text);
	fclose(fpt);
}
