public class TestRectangle {
    public static void main(String[] args) {

        Rectangle[] rects = new Rectangle[10];

        for (int i=0; i<10; i++){
            Rectangle rect = new Rectangle();
            rect.width = Math.random();
            rect.height = Math.random();
            rect.area = rect.height * rect.width;
            rects[i] = rect;
        }

        double largest = 0;
        int largestID = 0;
        double smallest = 1;
        int smallestID = 0;

        for (int i=0; i<10; i++){
            if (rects[i].area > largest){
                largest = rects[i].area;
                largestID = i;
            }
        }

        for (int i=0; i<10; i++){
            if (rects[i].area < smallest){
                smallest = rects[i].area;
                smallestID = i;
            }
        }

        System.out.println("The largest rectangle is rect" + largestID);
        System.out.println("width\t: " + rects[largestID].width);
        System.out.println("height\t: " + rects[largestID].height);
        System.out.println("area\t: " + rects[largestID].area);

        System.out.println("The smallest rectangle is rect" + smallestID);
        System.out.println("width\t: " + rects[smallestID].width);
        System.out.println("height\t: " + rects[smallestID].height);
        System.out.println("area\t: " + rects[smallestID].area);


    }
}


