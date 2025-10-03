class Node {
    String playerName; 
    String position; 
    String specialAbility;
    char skillPower;
    char skillSpeed;
    char skillStamina;
    int overallRating;
    Node next;
    Node prev;

    public Node(String playerName, String position, String specialAbility, char skillPower, char skillSpeed, char skillStamina, int overallRating) {
        this.playerName = playerName ;
        this.position = position ;
        this.specialAbility = specialAbility ;
        this.skillPower = skillPower ;
        this.skillSpeed = skillSpeed ;
        this.skillStamina = skillStamina ;
        this.overallRating = overallRating ;
        this.next = null ;
        this.prev = null ;
    }
}