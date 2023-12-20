![alt_text](https://media.discordapp.net/attachments/852653617798185012/1175031954236772402/banner.png)

# **Myths and Mists**
This project was developed by Clara Sousa (up202207583@up.pt), João Mendes (up202208586@up.pt) and Miguel Moita (up202207678@up.pt) for LDTS 2022-23.
For a more detailed version of this description click [here](./docs/README.md).

## A story on love & loss, powered by Lanterna

Myths and Mists is based on the Greek myth of Orpheus and Eurydice, a story about a newlywed couple that turns into a proof of love, an encounter with the underworld and with loss. An unforgettable and touching story that we crafted into a Java interactive adventure, powered by Lanterna.

## Structure

Just like a musical or a play, the game will be divided into 3 different acts: each with its own particularities.

### Act 1: Love at First Sight / Into the Underworld

The first act will be presented to the user in 2 segments:
> Love at First Sight

> Into the Underworld

**Love at First Sight**

The first segment of Act 1 is a text-based story. The window will show the beginning of the myth. A sort of intro. 

Keep in mind that, during the game, text-based sentences will be showed, just to keep context of the story and improve the overall storytelling experience.

*It's the boring part, we get that.*

**Into the Underworld**

Without getting into much detail or spoil, Orpheus will need to go into the Underworld. 

In this level, the base will be the 'hero' tutorial presented in class.

Our 'hero' will be Orpheus, trying to reach the Underworld to talk to Hades, avoiding obstacles.

You'll have the possibility to retry, if failed.

When you reach the Underworld, the window will fade to black. Time for Act 2.

*A true hero shall pass Act 1 at the first try.*

### Act 2: A Sung Promise

The second act will focus on the Underworld.

Still following a simple approach (or other?), the user will now have to face all of the dangers of the Underworld and have a talk with Hades.

Orpheus is a good singer. So, taking advantage on that, you'll have to sing through the level.

By clicking on a key, Orpheus will "shoot" musical notes out of his mouth. This will make all the obstacles, like Cerberus (the gigantic three-headed hound) to let you pass.

When you reach to Hades, you'll have to explain why you are there. A promise will be made.

*Don't look back on a promise.*

### Act 3: Turning Love into Death

After the said promise, Orpheus will walk out of the  Underworld.

You will be presented with a maze and a sentence on top of the screen: 
"Want to look back? Press [X]".

As you go through the maze, you'll have the opportunity to look back.

> Good Ending

> Bad Ending

**Good Ending**

Congratulations. If you reached the good ending, you reached the end of the maze. And you didn't look back, even though the shivering sentence was haunting you all the time. That will prompt the good ending, again, as a text-based segment that explains it.

**Bad Ending**

You probably did reach the end of the maze. But you looked back. If you were tempted by that sentence, the game is over - the bad ending prompts.


That's how the game ends. Even though in the original story the only ending is our bad ending, we decided to take our twist and implement a second ending, considering that not all players know the myth behind the game.

*All good things must come to an end. The bad ones too.*

## Class Diagram

### UML approach
As we didn't start coding much yet, this is our current class diagram. Every class name should be understandable due to the game's structural context.
![UML LDTS](https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/132692222/fc15f534-f01f-408a-8900-ac5a9f74524c)

## Sreenshots
The following screenshots offer a glimpse into the overall appearance of our game, showcasing its diverse functionalities and illustrating the progression of the story.
### Menu
<p align="center" justify="center">
<img width="728" alt="Captura de ecrã 2023-11-26, às 18 53 34" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/4ae8bb2e-9af2-48fe-94b2-a07359f12af3">
</p>
<p align="center">
  <b><i>Fig 1. Main Menu </i></b>
</p>  

The Menu is simple and intuitive. You can choose to start playing the game, navigate to options to manage the music, or exit the game.

### Options
<p align="center" justify="center">
<img width="862" alt="Options" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/eb96d70f-258e-4267-9421-c8d642c02e6d">
</p>
<p align="center">
  <b><i>Fig 2. Options Menu </i></b>  
</p>  
If you select options, you will be able to choose whether you want the music volume lower, higher, muted, or even a different music track.

### Prologue
<p align="center" justify="center">
<img width="1039" alt="Prologue" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/bfebf535-246f-49a0-b952-8e7edd7ca9b1">
</p>
<p align="center">
  <b><i>Fig 3. Prologue: First Text Section </i></b>  
</p>  
In-game text sections maintain a consistent style, resembling something simple and readable on every screen. The objective is to impart information about the story and offer context for the game, all while evoking the mystique and ambiance reminiscent of ancient Greek tales and plays presented in the form of a poem. This thematic approach persists throughout the game, weaving a poetic thread that harkens back to the storytelling traditions of ancient Greece...

### Act1
<p align="center" justify="center">
<img width="519" alt="Act1" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/7efddee6-d104-4ea2-9c7f-fd329ff70a83">
  </p>
  <p align="center">
  <b><i>Fig 4.1. Act1: Map1 </i></b> 
    </p>  
    <p align="center" justify="center">
<img width="519" alt="Act15" src=https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/83a5cf3f-f231-4c28-87d8-89faa7a91ebd">
  </p>
  <p align="center"> 
  <b><i>Fig 4.2. Act1: Map1.5 </i></b>  
</p>
In this level, the player (Orpheus) needs to collect at least 10 drachmas (5 in each map) to access the underworld while maintaining his energy. If his energy drops to zero due to encounters with demons or souls, the game ends.

### Interlude1 
<p align="center" justify="center">
<img width="1039" alt="Interlude1" src=https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/6def1936-32dd-42a2-a0aa-64a7dc5d2395">
<p align="center">
  <b><i>Fig 5. Interlude1: Text Section </i></b>  
</p>
Upon reaching the Underworld, Orpheus now encounters the challenge of dealing with Cerberus.

### Act2 
<p align="center" justify="center">
<img width="1039" alt="Act2" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/1e3dc087-2f11-47d6-a716-ef01364613b3">
<p align="center">
  <b><i>Fig 6. Act2: Map2 </i></b>  
</p>
Orpheus must skillfully evade the three-headed representation of Cerberus, embodied by dogs, and skillfully navigate through demons and souls without depleting his energy entirely. Successfully overcoming this challenge is crucial for advancing to the next level, ultimately leading to the long-awaited encounter with Hades.

### Interlude2 
<p align="center" justify="center">
<img width="1039" alt="Interlude2" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/7e59208f-3788-432a-a9db-88c43c949539">
<p align="center">
  <b><i>Fig 7. Interlude2: Text Section </i></b>  
</p>
Orpheus finally confronts Hades, hopeful to be reunited with his lover. Hades agrees to the reunion, but with a single condition: Orpheus must proceed with complete trust, believing that his beloved is faithfully following him. Hades emphasizes that if the strength of their love is as profound as Orpheus claims, he will trust and instructs Orpheus to resist the urge to look back until the opportune moment.

### Act2
<p align="center" justify="center">
  <img width="1039" alt="Act2" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/1c5cbcac-2036-42fc-b39c-6935bc44e3ea">
<p align="center">
  <b><i>Fig 8. Act2: The Final Act </i></b>  
</p>
Orpheus is alone in a corridor, or is he? Where should he look back? 

### Endings
#### Good Ending
<p align="center" justify="center">
<img width="1039" alt="GoodEnding" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/848bc81c-8f3c-4dd1-975e-e443db094843">
<p align="center">
  <b><i>Fig 9.1. Good Ending </i></b>  
</p>
Your love proved to be unwavering, and you gazed back at the right moment. As a result, you emerge victorious, and you and Eurydice can now embark on your happily ever after.

#### Bad Ending
<p align="center" justify="center">
<img width="1039" alt="GoodEnding" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/05bf429f-3b8c-4552-9d68-51b9f64d001c">
<p align="center">
  <b><i>Fig 9.2. Good Ending </i></b>  
</p>
Unfortunately, despite the deep love between Orpheus and Eurydice, you succumbed to doubt and looked back prematurely. As a consequence, the agreement with Hades was broken, and Eurydice vanished from Orpheus's sight forever. The once hopeful journey concludes in sorrow, with Orpheus left to bear the weight of his regret.

## Design Patterns
### Factory Method Pattern 

A creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

The base Game class uses the LanternaGUI library for its graphical interface, ensuring consistent behavior across platforms. Through the factory method pattern, platform-specific GUI components can be generated without rewriting the Game class logic. This approach involves interacting with abstract GUI components, maintaining functionality through a common base class or interface.


### Composite Pattern

A structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

In the game, the CompoundGraphic concept is reflected in the MenuState and Menu classes, functioning as a unified container for diverse graphical elements. The client code in the Game class interacts seamlessly with these graphics, abstracted through a common interface, enabling flexible handling of complex graphic structures without direct coupling to specific classes.

### Game Loop Pattern

A behavioral design pattern that orchestrates the continuous and structured execution of steps such as updating, rendering, and handling input in a cycle, ensuring a seamless and responsive gaming experience.

In the Game program, the Game Loop Pattern choreographs the continuous execution of updating, rendering, and input handling, ensuring a responsive gaming experience. The cyclical orchestration within the main loop encapsulates the essence of this behavioral design pattern, facilitating a seamless and dynamic gameplay flow.

### State Pattern

This behavioral design pattern is an important part of our game. By implementing it, we can allow loading of "scenes".

We started by creating an abstract class called State that requires a Viewer and a Controller.

All together, we can now create a specific State for a level or for a menu.

This state simplifies and improves our code.

### MVC architectural Pattern

MVC stands for Model View Controller.

This pattern mostly relates to the UI/interaction layer of our game, allowing these three aspects to work together.

- Model - includes the class code itself, the pure application data and logic.

- Viewer - presents the data to the user, in this case, printing out to the GUI the information specified in the model.

- Controller - exists between the Model and the Viewer, listening to events triggered either by the Viewer or by the user.


The most simple example is the user pressing a key to show something ingame: the controller listens to the pressed key, the model processes this input and the viewer outputs it.

This is an important pattern for our project, as it allows all group elements to work simultaneously on the model, controller and viewers while also allowing models to have multiple viewers, something that can really come in handy.


### Template Method


The template method defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

This behavioral pattern is present in many aspects of our code, for example, in the creation of states, viewers and controllers.

For example:
- The State abstract class is defined
- Act1State, Act2State, Act3State classes are defined as extensions of the State class, overriding some of its' functions.

Overall, it is a nice pattern, as we can override only specific parts of the code, making them less suitable to errors triggered by changes to the rest of the code.



