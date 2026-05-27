public class DoorLock {

    private boolean locked;

    public void lock() {
        locked = true;
        System.out.println("Door LOCKED");
    }

    public void unlock() {
        locked = false;
        System.out.println("Door UNLOCKED");
    }

    public boolean isLocked() {
        return locked;
    }
}