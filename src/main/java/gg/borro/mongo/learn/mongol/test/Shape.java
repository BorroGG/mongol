package gg.borro.mongo.learn.mongol.test;

public abstract sealed class Shape permits Circle, Rectangle {

    void testSwitch(Shape shape) {
        double area = switch (shape) {
            case Circle c    -> Math.pow(c.getRadius(), 2) * Math.PI;
            case Rectangle r -> r.getA() * r.getB();
        };
    }

    int fib(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fib(n - 1) + fib(n - 2);
        };
    }

    void testRecord() {
        var point = new Point(1, 2);
        System.out.println(point.x()); // returns 1
        System.out.println(point.y()); // returns 2
    }

    void testInstanceOf(Object obj) {
        if (obj instanceof String s && s.length() > 5) {
            System.out.println("obj is a String with more than 5 characters: " + s.toUpperCase());
        }
    }

    void testTextBlocks() {
        String html = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
            """;
    }
}
