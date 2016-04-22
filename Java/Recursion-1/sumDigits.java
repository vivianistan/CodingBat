//sumDigits
//returns the sum of individual digits in n
public int sumDigits(int n) {
  if(n<10){
    return n; 
  }
  return n%10 + sumDigits(n/10);
}
