'''
@author: Shobhit Bhardwaj
'''

board = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']
win_set = [{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}]
player = player1 = player2 = marker = marker1 = marker2 = ''

def display_board(board):
    print(' '+board[6]+' | '+board[7]+' | '+board[8]+' '+'\n---|---|---')
    print(' '+board[3]+' | '+board[4]+' | '+board[5]+' '+'\n---|---|---')
    print(' '+board[0]+' | '+board[1]+' | '+board[2]+' ')

def player_input():
    global player1, player2, marker1, marker2, player, marker

    player1 = input('Please Enter Player1 Name - ')
    player2 = input('Please Enter Player2 Name - ')

    while not (marker1 == 'X' or marker1 == '0'):
        marker1 = input(f'{player1}, Please Select ("X" or "0") - ')

    if marker1 == 'X':
        marker2 = '0'
    else:
        marker2 = 'X'
    player = player1
    marker = marker1
    print(f'{player1} Selects {marker1}, Hence {player2} Have {marker2}')

def win_check(board, marker):
    user_set = set()
    for i,val in enumerate(board):
        if val == marker:
            user_set.add(i)
    for win in win_set:
        if win.issubset(user_set):
            return True
    return False

def player_choice(board, player, marker):
    position = ''
    while not (position in ['1', '2', '3', '4', '5', '6', '7', '8', '9']):
        position = input(f'{player}, Enter Position from (1 to 9) - ')
    position = int(position) - 1
    if board[position] == ' ':
        board[position] = marker
    return board

player_input()
while (' ' in board):
    board = player_choice(board, player, marker)
    display_board(board)
    if win_check(board, marker):
        print(f'Player {player} Won the Game !!!')
        break
    if player == player1:
        player = player2,
        marker = marker2
    else:
        player = player1
        marker = marker1
else:
    print('No More Moves')