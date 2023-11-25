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

## Class diagram

### UML approach
As we didn't start coding much yet, this is our current class diagram. Every class name should be understandable due to the game's structural context.

## Implemented approaches

## List of features

## Design patterns
### Factory Method Pattern 

A creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

The base Game class uses the LanternaGUI library for its graphical interface, ensuring consistent behavior across platforms. Through the factory method pattern, platform-specific GUI components can be generated without rewriting the Game class logic. This approach involves interacting with abstract GUI components, maintaining functionality through a common base class or interface.


### Composite Pattern

A structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

In the game, the CompoundGraphic concept is reflected in the MenuState and Menu classes, functioning as a unified container for diverse graphical elements. The client code in the Game class interacts seamlessly with these graphics, abstracted through a common interface, enabling flexible handling of complex graphic structures without direct coupling to specific classes.

### Game Loop Pattern

A behavioral design pattern that orchestrates the continuous and structured execution of steps such as updating, rendering, and handling input in a cycle, ensuring a seamless and responsive gaming experience.

In the Game program, the Game Loop Pattern choreographs the continuous execution of updating, rendering, and input handling, ensuring a responsive gaming experience. The cyclical orchestration within the main loop encapsulates the essence of this behavioral design pattern, facilitating a seamless and dynamic gameplay flow.

## Testing




