public class AccessExample {

    // Phương thức công khai, có thể truy cập từ bất kỳ đâu
    public void publicMethod() {
        System.out.println("Đây là phương thức công khai (truy cập từ bất cứ đâu)");
    }

    // Phương thức private, chỉ có thể truy cập trong cùng một class
    private void privateMethod() {
        System.out.println("Đây là phương thức bí mật (chỉ truy cập ở cùng một class)");
    }

    // Phương thức protected, chỉ có thể truy cập khi trong cùng package hoặc subclass
    protected void protectedMethod() {
        System.out.println("Đây là phương thức được protected (chỉ truy cập khi cùng package hoặc subclass)");
    }
}
