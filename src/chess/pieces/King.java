package chess.pieces;

import java.awt.Color;

import boardgame.Board;
import chess.ChessPiece;

public class King extends ChessPiece{
	public King(Board board, Color color) {
		super(board,color);
	}
	
	@Override
	public String toString(){
		return "K";
		}
	@Override
	public boolean[][] possibleMoves(){
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
		}
	}

