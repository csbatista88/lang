#include <stdio.h>

main () {
	FILE *fpt;
	fpt=fopen("output.txt","w");
	fprintf(fpt,"This is a test.");
	fclose(fpt);
}
