
class Solution {
    public List<String> fizzBuzz(int n) {
        
          String[] answer = new String[n];

        //   for(int i = 1; i <= n; i++){
        //     if(i % 3 == 0 && i % 5 == 0){
        //         answer[i-1] = "FizzBuzz";
        //     }else if(i % 3 == 0){
        //         answer[i-1] = "Fizz"; 

        //     }else if(i % 5 == 0){
        //           answer[i-1] = "Buzz";
        //     }else {
        //         answer[i-1] = String.valueOf(i);
        //     }
        //   }
        //   return Arrays.asList(answer);
            
            // List<String> list = new ArrayList<>(n+1);
            String[] list = new String[n];

            int l = 1;
            int r = n;
            while(l <= r){
                if(l % 3== 0 && l %5 == 0){
                    // list.add(l-1,"FizzBuzz");
                    list[l-1] = "FizzBuzz";
                }else if(l % 3 == 0){
                    // list.add(l-1,"Fizz");
                    list[l-1] = "Fizz";
                }else if(l % 5 == 0){
                    // list.add(l-1,"Buzz");
                    list[l-1] = "Buzz";
                }else {
                    //   list.add(l-1,String.valueOf(l));
                    list[l-1] = String.valueOf(l);
                }
                
                 if(r % 3== 0 && r %5 == 0){
                    // list.add(r-1,"FizzBuzz");
                    list[r-1] = "FizzBuzz";
                }else if(r % 3 == 0){
                    // list.add(r-1,"Fizz");
                    list[r-1] = "Fizz";
                }else if(r % 5 == 0){
                    // list.add(r-1,"Buzz");
                    list[r-1] = "Buzz";
                }else {
                    //   list.add(r-1,String.valueOf(r));
                    list[r-1] = String.valueOf(r);
                }
                l++;
                r--;
            }
            return Arrays.asList(list);
      }
}