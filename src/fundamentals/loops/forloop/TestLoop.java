package fundamentals.loops.forloop;

public class TestLoop {
        public static void main (String[] args) {
            int i=0;
            for(;;)
            {
                if(i==5)
                    break;
                System.out.print(i);
                i++;
            }
        }

    }
