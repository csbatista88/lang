#include <stdio.h>

main() {
	
	FILE *arquivo;
	char texto[80];
	int bytes_read;
	arquivo=fopen("data.txt","r");
	bytes_read=fread(texto,1,70,arquivo);
	printf("%d\n",bytes_read);
	fclose(arquivo);
}
