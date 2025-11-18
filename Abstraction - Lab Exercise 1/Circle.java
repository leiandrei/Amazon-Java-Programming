class Circle extends Shape {

    private float fltRadius;
    private String strLineColor;

    Circle(float fltR, String tstrLColor) {
        this.fltRadius = fltR;
        this.strLineColor = tstrLColor;
    }

    @Override
    public float fltCalculateArea() {
        float fltArea = (float)Math.PI * this.fltRadius * this.fltRadius;

        return fltArea;
    }
    
    @Override
    public float fltCalculatePerimeter() {
        float fltPerimeter = 2 * (float)Math.PI * this.fltRadius;
        return fltPerimeter;
    }

    @Override
    public String strLineColor() {
        return this.strLineColor;
    }

    @Override
    public void funcDraw() {
        System.out.println("Drawing Circle with Radius = " + this.fltRadius);
    }




}