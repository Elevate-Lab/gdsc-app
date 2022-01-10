package com.gdsciiita.android.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.gdsciiita.android.model.Member;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MemberDao_Impl implements MemberDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Member> __insertionAdapterOfMember;

  private final EntityDeletionOrUpdateAdapter<Member> __deletionAdapterOfMember;

  private final EntityDeletionOrUpdateAdapter<Member> __updateAdapterOfMember;

  public MemberDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMember = new EntityInsertionAdapter<Member>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `member_database` (`id`,`name`,`type`,`team`,`designation`,`profile_pic`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Member value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getType());
        stmt.bindLong(4, value.getTeam());
        if (value.getDesignation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDesignation());
        }
        if (value.getProfilePic() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProfilePic());
        }
      }
    };
    this.__deletionAdapterOfMember = new EntityDeletionOrUpdateAdapter<Member>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `member_database` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Member value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfMember = new EntityDeletionOrUpdateAdapter<Member>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `member_database` SET `id` = ?,`name` = ?,`type` = ?,`team` = ?,`designation` = ?,`profile_pic` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Member value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getType());
        stmt.bindLong(4, value.getTeam());
        if (value.getDesignation() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDesignation());
        }
        if (value.getProfilePic() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getProfilePic());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object insert(final Member member, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMember.insert(member);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final Member member, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMember.handle(member);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final Member member, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMember.handle(member);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Member>> getMembers() {
    final String _sql = "SELECT * from member_database ORDER BY id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"member_database"}, new Callable<List<Member>>() {
      @Override
      public List<Member> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "team");
          final int _cursorIndexOfDesignation = CursorUtil.getColumnIndexOrThrow(_cursor, "designation");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "profile_pic");
          final List<Member> _result = new ArrayList<Member>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Member _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final int _tmpTeam;
            _tmpTeam = _cursor.getInt(_cursorIndexOfTeam);
            final String _tmpDesignation;
            if (_cursor.isNull(_cursorIndexOfDesignation)) {
              _tmpDesignation = null;
            } else {
              _tmpDesignation = _cursor.getString(_cursorIndexOfDesignation);
            }
            final String _tmpProfilePic;
            if (_cursor.isNull(_cursorIndexOfProfilePic)) {
              _tmpProfilePic = null;
            } else {
              _tmpProfilePic = _cursor.getString(_cursorIndexOfProfilePic);
            }
            _item = new Member(_tmpId,_tmpName,_tmpType,_tmpTeam,_tmpDesignation,_tmpProfilePic);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Member> getMember(final int id) {
    final String _sql = "SELECT * from member_database WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"member_database"}, new Callable<Member>() {
      @Override
      public Member call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "team");
          final int _cursorIndexOfDesignation = CursorUtil.getColumnIndexOrThrow(_cursor, "designation");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "profile_pic");
          final Member _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final int _tmpTeam;
            _tmpTeam = _cursor.getInt(_cursorIndexOfTeam);
            final String _tmpDesignation;
            if (_cursor.isNull(_cursorIndexOfDesignation)) {
              _tmpDesignation = null;
            } else {
              _tmpDesignation = _cursor.getString(_cursorIndexOfDesignation);
            }
            final String _tmpProfilePic;
            if (_cursor.isNull(_cursorIndexOfProfilePic)) {
              _tmpProfilePic = null;
            } else {
              _tmpProfilePic = _cursor.getString(_cursorIndexOfProfilePic);
            }
            _result = new Member(_tmpId,_tmpName,_tmpType,_tmpTeam,_tmpDesignation,_tmpProfilePic);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<Member>> getSubTeam(final int team) {
    final String _sql = "SELECT * from member_database WHERE team = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, team);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"member_database"}, new Callable<List<Member>>() {
      @Override
      public List<Member> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfTeam = CursorUtil.getColumnIndexOrThrow(_cursor, "team");
          final int _cursorIndexOfDesignation = CursorUtil.getColumnIndexOrThrow(_cursor, "designation");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "profile_pic");
          final List<Member> _result = new ArrayList<Member>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Member _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final int _tmpTeam;
            _tmpTeam = _cursor.getInt(_cursorIndexOfTeam);
            final String _tmpDesignation;
            if (_cursor.isNull(_cursorIndexOfDesignation)) {
              _tmpDesignation = null;
            } else {
              _tmpDesignation = _cursor.getString(_cursorIndexOfDesignation);
            }
            final String _tmpProfilePic;
            if (_cursor.isNull(_cursorIndexOfProfilePic)) {
              _tmpProfilePic = null;
            } else {
              _tmpProfilePic = _cursor.getString(_cursorIndexOfProfilePic);
            }
            _item = new Member(_tmpId,_tmpName,_tmpType,_tmpTeam,_tmpDesignation,_tmpProfilePic);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
