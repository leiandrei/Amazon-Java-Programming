class Rectangle extends Shape {
    private float fltWidth;
    private float fltHeight;
    private String strColor;

    Rectangle(float fltW, float fltH, String strLColor) {
        this.fltWidth = fltW;
        this.fltHeight = fltH;
        this.strColor = strLColor;
    }

    @Override
    public float fltCalculateArea() {
        float fltArea = this.fltWidth * this.fltHeight;
        return fltArea;
    }

    @Override
    public void funcDraw() {
        System.out.println("Drawing Rectangle with Width = " +
                this.fltWidth + " and Height = " + this.fltHeight);
    }

    @Override
    public String strLineColor() {
        return this.strColor;
    }


}
