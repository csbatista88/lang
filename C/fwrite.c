#include <stdio.h>
#include <string.h>

main() {
	FILE *arquivo;
	char texto[80];
	sprintf(texto,"Fortytwo 42 bytes of data on the wall...");
	arquivo=fopen("data2.txt","w");
	fwrite(texto,1,strlen(texto),arquivo);
}
