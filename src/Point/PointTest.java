package Point;


class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point(8,8);
        System.out.println(point1);

        MoveablePoint moveablePoint = new MoveablePoint(5,6, 8,9);
        moveablePoint.move();
        System.out.println(moveablePoint.getX());
        System.out.println(moveablePoint.getY());

    }
}