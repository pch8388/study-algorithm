package me.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    @Test
    void solve() {
        ValidSudoku v = new ValidSudoku();
        final boolean r1 = v.isValidSudoku(new char[][]{
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
            , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
            , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
            , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
            , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
            , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
            , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
            , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
            , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        });
        final boolean r2 = v.isValidSudoku(new char[][]{
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'}
            , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
            , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
            , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
            , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
            , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
            , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
            , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
            , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        });

        final boolean r3 = v.isValidSudoku(new char[][]{
            {'.', '.', '.', '.', '5', '.', '.', '1', '.'}
            ,{'.', '4', '.', '3', '.', '.', '.', '.', '.'}
            ,{'.', '.', '.', '.', '.', '3', '.', '.', '1'}
            ,{'8', '.', '.', '.', '.', '.', '.', '2', '.'}
            ,{'.', '.', '2', '.', '7', '.', '.', '.', '.'}
            ,{'.', '1', '5', '.', '.', '.', '.', '.', '.'}
            ,{'.', '.', '.', '.', '.', '2', '.', '.', '.'}
            ,{'.', '2', '.', '9', '.', '.', '.', '.', '.'}
            ,{'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        });

        assertTrue(r1);
        assertFalse(r2);
        assertFalse(r3);
    }
}