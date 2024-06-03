package interfaces_02062024;

public class MusicPlayer implements Playable{
/*
Create a new Java project in IntelliJ (please only a backend application) and implement the following steps:

    Step 1: Define an interface 'Playable' that contains a method 'play' without implementation.

    Step 2: Create a class 'MusicPlayer' that implements the 'Playable' interface. Implement the 'play' method to play a song.

    Step 3: Create a class 'VideoPlayer' that also implements the 'Playable' interface. Implement the 'play' method to play a video.

    Step 4: Create a class 'MediaController' that contains a method 'playMedia'. This method should accept a 'Playable' object as a parameter and invoke the 'play' method.

    Step 5: In the 'main' method, initialize an object of the 'MusicPlayer' and 'VideoPlayer' classes with the 'Playable' interface (polymorphism).

    Step 6: In the 'main' method, create an object of the 'MediaController' class and use it to play both a song and a video.

    Please post the link to your GitHub repository where you have solved this task together.

If you have completed this task early, feel free to practice on Codewars!
 */
public void play(){
    System.out.println("play song");
}
}
