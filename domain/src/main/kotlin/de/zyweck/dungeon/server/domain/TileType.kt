package de.zyweck.dungeon.server.domain

import de.zyweck.dungeon.server.domain.TileConnectorPosition.BOTTOM
import de.zyweck.dungeon.server.domain.TileConnectorPosition.LEFT
import de.zyweck.dungeon.server.domain.TileConnectorPosition.RIGHT
import de.zyweck.dungeon.server.domain.TileConnectorPosition.TOP

enum class TileType(
    val tileConnectorPositions: List<TileConnectorPosition>,
    val initialCountInStack: Int,
) {
    PATH_CROSSING(listOf(TOP, RIGHT, BOTTOM, LEFT), 7),
    PATH_T_CROSSING(listOf(RIGHT, BOTTOM, LEFT), 5),
    PATH_STRAIGHT(listOf(RIGHT, LEFT), 4),
    PATH_CURVE(listOf(BOTTOM, LEFT), 4),
    ROOM_CROSSING(listOf(TOP, RIGHT, BOTTOM, LEFT), 14),
    ROOM_T_CROSSING(listOf(RIGHT, BOTTOM, LEFT), 13),
    ROOM_STRAIGHT(listOf(RIGHT, LEFT), 17),
    ROOM_CURVE(listOf(BOTTOM, LEFT), 9),
    START(listOf(TOP, RIGHT, BOTTOM, LEFT), 1),
}
