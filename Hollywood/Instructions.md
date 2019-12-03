# Hollywood

Now that you know how to write software, everyone is asking you for something.
You've caught the attention of a bigshot from L.A. and they've asked you to
build a basic accounting program for their talent agency. It's your job to meet
these requirements. I expect you to use one example of inheritance and one
example of an interface or explain why you chose not to.

Your task is to build a program that allows him to calculate how much he gets
paid for from the stars in his lineup. These are the tiers of stars.

### A List celeb
- Works 6 hour days
- Value increase by $200,000 every time they **shoot a movie**
- Value increase by $50,000 every time they **shoot a TV episode**
- Value increase by $10,000 every time they **star in a play**

### B List celeb
- Works 8 hour days
- Value increase by $100,000 every time they **shoot a movie**
- Value increase by $35,000 every time they **shoot a TV episode**
- Value increase by $1,000 every time they **perform a voiceover**

### Reality TV star List celeb
- Works 16 hour days
- Value increase by $5,000 every time they **shoot a movie**
- Value increase by $500 every time they **shoot a TV episode**
- Value increase by $500 every time they **perform a voiceover**

### Bonus Points
The agent receives a 5% commission fee on work for A List celebs, 10% on B List
celebs, and 30% for reality stars.

The goal of your program is to create a single method that tells how much of a
fee they make if they have some number of clients at different tiers who all do
some type of work. For example if they have 2 A-List celebrities who shoot a
movie, a B-list celebrities who perform a voiceover, another who shoots a movie,
and a reality star to who records 5 episodes, what does the agent make?
