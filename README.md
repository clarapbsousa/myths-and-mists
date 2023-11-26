![alt_text](https://media.discordapp.net/attachments/852653617798185012/1175031954236772402/banner.png)

# **Myths and Mists**
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

## Mockups
### Menu
<img width="728" alt="Captura de ecrã 2023-11-26, às 18 53 34" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/4ae8bb2e-9af2-48fe-94b2-a07359f12af3">

We've implemented a simple menu. In the future it may look better - let's focus on more important aspects for now.

### Prologue
<img width="728" alt="Captura de ecrã 2023-11-26, às 18 55 22" src="https://github.com/FEUP-LDTS-2023/project-l13gr02/assets/116096892/0faf9ec1-517d-45a4-b53b-f82838d12b3e">

Text sections will essentially look like this. Something simple and readable on every screen, keeping you updated with the story.

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



