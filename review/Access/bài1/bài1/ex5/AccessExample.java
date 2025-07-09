public class AccessExample {

    public void publicMethod() {
        System.out.println("Đây là phương thức công khai (truy cập từ bất cứ đâu)");
    }

    private void privateMethod() {
        System.out.println("Đây là phương thức bí mật (chỉ truy cập ở cùng một class)");
    }

    protected void protectedMethod() {
        System.out.println("Đây là phương thức được protected (chỉ truy cập khi cùng package hoặc subclass)");
    }
}

