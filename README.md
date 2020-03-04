# homework
public int Fibonacci.of(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return Fibonacci.of(n-1) + Fibonacci.of(n-2);
}
int main(){
for(int i=0;i++;i<100)
  int k = Fibonacci.of(i);
  system.out.print("Fibonacci.of("+i+")"+"="+k);
}
