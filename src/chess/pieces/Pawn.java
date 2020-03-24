package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);
		if (getColor() == Color.WHITE) {

			p.setValues(position.getRow() - 2, position.getColumn());

			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && getMoveCount() == 0
					&& getBoard().thereIsAPiece(p) == false) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			p.setValues(position.getRow(), position.getColumn());

			p.setValues(position.getRow() - 1, position.getColumn());

			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && getBoard().thereIsAPiece(p) == false) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			p.setValues(position.getRow(), position.getColumn());

			p.setValues(position.getRow() - 1, position.getColumn() - 1);
			
			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow(), position.getColumn());

			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			
			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}

		} else {
			p.setValues(position.getRow() + 2, position.getColumn());

			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && getMoveCount() == 0
					&& getBoard().thereIsAPiece(p) == false) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			p.setValues(position.getRow(), position.getColumn());

			p.setValues(position.getRow() + 1, position.getColumn());

			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && getBoard().thereIsAPiece(p) == false) {
				mat[p.getRow()][p.getColumn()] = true;
			}

			p.setValues(position.getRow(), position.getColumn());

			p.setValues(position.getRow() + 1, position.getColumn() - 1);
			
			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValues(position.getRow(), position.getColumn());

			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			
			if (getBoard().positionExists(p.getRow(), p.getColumn()) == true && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}

		return mat;
	}

	@Override

	public String toString() {
		return "P";
	}

}
