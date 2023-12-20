# LDTS_T13_G02 - Myths and Mists

## Game Developers
This project was developed by Clara Sousa (up202207583@up.pt), João Mendes (up202208586@up.pt) and Miguel Moita (up202207678@up.pt) for LDTS 2022-23.

## Implemented Features

- **Connected Menus** - The user has the capability of browsing through the different menus. (Ex: Main Menu and Options Menu).
- **Keyboard control** - The keyboard inputs are received through the respective events and interpreted according to the current game state.
- **Player control** - The player may move with the keyboard control, pass through th Text-Sections and excute other functions.
- **Collisions detection** - Collisions between different objects are verified. (Ex: Player/Orpheus, Dracmas, Enemies, Walls).
- **Different levels** - 3 distinct levels with unique text sections, each offering different contexts, provides a dynamic and engaging narrative structure.
  This approach allows for diverse storytelling elements and contributes to the overall richness and depth of the narrative experience.

## Planned Features
All the planned features were successfully implemented.

## Design

### General Structure
#### Problem in Context:
Our initial project concern revolved around defining the structure, especially given that our game involves a graphical user interface (GUI) and is segmented into different states. To address this, specific design patterns were considered to ensure optimal fulfillment of our project requirements.
#### The Patterns:
The patterns applied to the project, were **Factory Method Pattern, Composite Pattern, Game Loop Pattern, State Pattern, MVC architectural Pattern, Template Method and the Facade Pattern**.  
#### Implementation:
In terms of implementation, we've established distinct classes with specific roles. We have classes dedicated to data storage (models), classes governing the game's logic (controllers), and classes responsible for visual effects on the screen (viewers). These classes are interconnected in the following manner:
**UML**
