# Team Time

## Use cases

- Create team members, which include
  - Name
  - Timezone
- Show the current time
  - Show unique time zones
    - For each time zone, show the names of team members in them
    - Show the local time
- Enter a time, based on a person's time zone
  - For example: Time for Paul at 7am, which should show
    - Unique time zones
      - ...
- (Optional)
  - Know when time zones are out of working hours

## Requirements

- I should be able to CRUD team members
  - Name
  - Time zone
- I should be able to enter commands, which include
  - Show times, shows current time
  - Get times, gets past/future time
- When displaying times with show/get, the format should be
  - Render time zones from earliest to latest, for example
    - UTC-10, UTC-0, UTC+10
  - Show time zone names, for example
    - UTC-10 (AKDT), UTC-0 (UTC), UTC+10 (AEST)

## Data modelling

- Team member
  - Name
  - Time zone
  - City
  - Country
  - Work hours
- Time zone database
  - Time zone
  - City
  - Country
- Work hours
  - Start
  - End

## UX design

### Initial screen

```shell
Menu

1. Show team time
2. Get team time
3. Create team member
4. Update team member
5. Delete team member

Enter option:
```

### Show team time

Note: OOO = Out of Office, IO = In Office. Ideally should use emojis to represent.

```shell
Current time: 10:40am

UTC-10, AKDT, IO, Alice (Fairbanks), 2:40pm
UTC-0, BST, OOO, Bob (London), 12:40am
UTC+10, AEST, IO, Charlie (Brisbane), 10:40am
UTC+10, AEST, IO, David (Brisbane), 10:40am

Press any key to return to menu
```

### Get team time

#### Happy path

```shell
Enter team member name: Bob
Enter time for Bob: 10:35am

UTC-10, AKDT, OOO, Alice (Fairbanks), 12:35am
UTC-0, BST, IO, Bob (London), 10:35am
UTC+10, AEST, OOO, Charlie (Brisbane), 8:40am
UTC+10, AEST, OOO, David (Brisbane), 8:40am

Press any key to return to menu
```

#### Invalid team member

```shell
Enter team member name: Paul

Error: Can't find team member called Paul

Press any key to try again
Press Q to return to menu
```

#### Invalid time

```shell
Enter team member name: Bob
Enter time for Bob: 35am

Error: Invalid time

Press any key to try again
Press Q to return to menu
```
