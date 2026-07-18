#include<stdio.h>
int find_stringLength(const char *str){
	
	int len = 0 ;

	while(str[len]!='\0'){
		len++;
	}

	return len ;

}
int find_substring(const char *haystack, const char *needle) {

    int haystack_len = find_stringLength(haystack);
    int needle_len = find_stringLength(needle);

    for (int i = 0; i <= haystack_len - needle_len; i++) {

        int k = i;
        int j = 0;

        while (j < needle_len) {

            if (haystack[k] != needle[j]) {
                break;
            }

            k++;
            j++;
        }

        if (j == needle_len) {
            return i;
        }
    }

    return -1;
}


int main(){

     char hayStack[] = "Embedded Systems";
     char needle[]  = "bed";

     printf("%d" , find_substring(hayStack, needle)) ;

     return 0 ;
}






