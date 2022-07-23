## DESCRIPTION:
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

### Examples
```
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
```

### Good solutions
````
import static java.util.Arrays.stream;

class Kata {
  static String highAndLow(String numbers) {
    var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    return stats.getMax() + " " + stats.getMin();
  }
}
````

````
import java.util.*;

public class Kata {
  private static final String SPACE = " ";
  public static String highAndLow(String numbers) {
    TreeSet<Integer> numberSet = new TreeSet<Integer>();   
    String[] numberArr = numbers.split(SPACE);
    for(String numberVal: numberArr){
     numberSet.add(Integer.parseInt(numberVal));
    }                   
    return String.valueOf(numberSet.last()) + SPACE +String.valueOf(numberSet.first());                
      
  }
}
````