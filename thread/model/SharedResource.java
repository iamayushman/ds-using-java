package thread.model;

public class SharedResource {
    /* use volatile on private member
     * or use synchronized on getters and setters
     */
    private volatile boolean flag;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
