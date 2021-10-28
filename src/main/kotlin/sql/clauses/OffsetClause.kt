package sql.clauses

import sql.ParameterizedSqlizable

/**
 * @author Dominik Hoftych
 */
class OffsetClause(private val offset: Long) : ParameterizedSqlizable() {
    override fun toSqlOneliner() = "OFFSET ?".also { params.add(offset) }
}
