package entity;

import domain.janggiPiece.JanggiChessPiece;
import domain.janggiPiece.Piece;
import domain.position.JanggiPosition;
import domain.type.JanggiTeam;

public record PieceEntity(
        int row,
        int col,
        JanggiTeam team,
        Piece type
) {
    public static PieceEntity of(JanggiPosition position, JanggiChessPiece piece) {
        return new PieceEntity(
                position.getRow(),
                position.getCol(),
                piece.getTeam(),
                piece.getChessPieceType()
        );
    }

    public JanggiChessPiece toPiece() {
        return type().create(team);
    }

    public String getTeamName() {
        return team.name;
    }

    public String getPieceName() {
        return type.name;
    }
}
