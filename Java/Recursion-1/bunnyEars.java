//bunnyEars
//returns total number of bunny ears (2 each)
public int bunnyEars(int bunnies) {
  if(bunnies == 0){
    return 0; 
  }
  return 2 + bunnyEars(bunnies-1); 
}
