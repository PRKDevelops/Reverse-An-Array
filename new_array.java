
package array;
public class new_array {
	public static int reverse(int numbers[]){
int first = 0, last = numbers.length-1;

while(first < last) {
	int temp = numbers[last];
	numbers[last] = numbers[first];
	numbers[first] = temp;
	
	first++;
	last--;
}
return last;

}
public static void main(String args[]) {
	int numbers[] = {21,5,45,55,98,90,67,35};
    reverse(numbers);
    for(int i=0; i<numbers.length; i++) {
    System.out.print(numbers[i]+ " ");
    }
    System.out.println();
}

}

