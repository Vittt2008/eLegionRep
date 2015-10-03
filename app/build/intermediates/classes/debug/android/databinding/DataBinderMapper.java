
package android.databinding;
import com.e.legion.test.app.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 14;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.view.View view, int layoutId) {
        switch(layoutId) {
            case com.e.legion.test.app.R.layout.fragment_repo:
                return com.e.legion.test.app.databinding.FragmentRepoBinding.bind(view);
            case com.e.legion.test.app.R.layout.include_user_profile:
                return com.e.legion.test.app.databinding.IncludeUserProfileBinding.bind(view);
            case com.e.legion.test.app.R.layout.element_repo:
                return com.e.legion.test.app.databinding.ElementRepoBinding.bind(view);
            case com.e.legion.test.app.R.layout.fragment_profile:
                return com.e.legion.test.app.databinding.FragmentProfileBinding.bind(view);
            case com.e.legion.test.app.R.layout.element_commit:
                return com.e.legion.test.app.databinding.ElementCommitBinding.bind(view);
            case com.e.legion.test.app.R.layout.header_repo_detail:
                return com.e.legion.test.app.databinding.HeaderRepoDetailBinding.bind(view);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -838838643:
                if(tag.equals("layout/fragment_repo_0"))
                    return com.e.legion.test.app.R.layout.fragment_repo;
                break;
            case -1965285214:
                if(tag.equals("layout/include_user_profile_0"))
                    return com.e.legion.test.app.R.layout.include_user_profile;
                break;
            case -720753973:
                if(tag.equals("layout/element_repo_0"))
                    return com.e.legion.test.app.R.layout.element_repo;
                break;
            case 1940278000:
                if(tag.equals("layout/fragment_profile_0"))
                    return com.e.legion.test.app.R.layout.fragment_profile;
                break;
            case -1329450672:
                if(tag.equals("layout/element_commit_0"))
                    return com.e.legion.test.app.R.layout.element_commit;
                break;
            case 1888369026:
                if(tag.equals("layout/header_repo_detail_0"))
                    return com.e.legion.test.app.R.layout.header_repo_detail;
                break;
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"commit"
            ,"dateFormat"
            ,"repo"
            ,"user"};
    }
}