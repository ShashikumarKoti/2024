package com.skoti.comparable;

public class Player implements Comparable<Player> {

    private int ranking;
    private String playerName;
    private int age;
    private Double salary;

    //sort by name
//    @Override
//    public int compareTo(Player player) {
//        return getPlayerName().compareTo(player.getPlayerName());
//    }

    //sort by ranking
//    @Override
//    public int compareTo(Player player) {
//        return Integer.compare(this.ranking, player.getRanking()) ;
//    }

    //sort by salary descending
    @Override
    public int compareTo(Player player) {
        return Double.compare(player.salary, salary);
    }

    public Player(int ranking, Double salary, int age, String playerName) {
        this.ranking = ranking;
        this.salary = salary;
        this.age = age;
        this.playerName = playerName;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ranking=" + ranking +
                ", playerName='" + playerName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
