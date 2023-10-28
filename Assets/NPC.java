package Assets;

public class NPC extends Players {
    Boolean status;

    public void setName(String npcName) {
        this.name = npcName;
    }

    public void setStatus(Boolean givenStatus) {
        this.status = givenStatus;
    }

    public Boolean getStatus() {
        return status;
    }
}
