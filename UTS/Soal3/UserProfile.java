class UserProfile {
    private int userId;
    private String bio;

    public UserProfile(int userId, String bio) {
        this.userId = userId;
        this.bio = bio;
    }

    public void displayProfileInfo() {
        System.out.println("User Profile [ID: " + userId + "] - Bio: " + bio);
    }
}