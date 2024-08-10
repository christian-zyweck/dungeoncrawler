package de.zyweck.dungeon.server.model

import de.zyweck.dungeon.server.model.TileConnectorPosition.BOTTOM
import de.zyweck.dungeon.server.model.TileConnectorPosition.LEFT
import de.zyweck.dungeon.server.model.TileConnectorPosition.RIGHT
import de.zyweck.dungeon.server.model.TileConnectorPosition.TOP

enum class TileType(
    vararg tileConnectorPositions: TileConnectorPosition,
) {
    PATH_CROSSING(TOP, RIGHT, BOTTOM, LEFT),
    PATH_T_CROSSING(RIGHT, BOTTOM, LEFT),
    PATH_STRAIGHT(RIGHT, LEFT),
    PATH_CURVE(BOTTOM, LEFT),
    ROOM_CROSSING(TOP, RIGHT, BOTTOM, LEFT),
    ROOM_T_CROSSING(RIGHT, BOTTOM, LEFT),
    ROOM_STRAIGHT(RIGHT, LEFT),
    ROOM_CURVE(BOTTOM, LEFT),
}
