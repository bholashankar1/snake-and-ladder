package assignment1.Assignment3;

    public static void mapTo(int dice, int pos) {
        Random random = new Random();
        int map = random.nextInt(bound 2);
        map = map + 1;
        System.out.println("Maping method: " + maping);

        switch (map) {
            case 1:
                System.println("no position");
                break;
            case 2:
                pos=pos+dice;
                System.out.println("position is : "+ pos);
                break;
            case 3 :
                pos=pos -dice;
                System.out.println("snake position : "+ pos);
                break;
        }
    }
}