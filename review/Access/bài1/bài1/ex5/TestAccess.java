public class TestAccess {
    public static void main(String[] args) {
        AccessExample a = new AccessExample();
        a.publicMethod();          // ✅ Chạy được vì là public
        // a.privateMethod();      // ❌ Không chạy được vì là private
        a.protectedMethod();       // ✅ Chạy được vì cùng package
    }
}

