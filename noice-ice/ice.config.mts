import {defineConfig} from '@ice/app';
import request from '@ice/plugin-request';
import store from '@ice/plugin-store';
import auth from '@ice/plugin-auth';

// The project config, see https://v3.ice.work/docs/guide/basic/config
const minify = process.env.NODE_ENV === 'production' ? 'swc' : false;
export default defineConfig(() => ({
    ssg: false,
    minify,
    plugins: [request(), store(), auth()],
    compileDependencies: false,
    proxy: {
        "/entityCreateApi": {
            enable: true,
            target: "http://127.0.0.1:8100/cyj-entity-creater"
        },
        "/dictionaryApi": {
            enable: true,
            target: "http://127.0.0.1:8100/cyj-entity-creater"
        },
        "/sqlApi": {
            enable: true,
            target: "http://127.0.0.1:8100/cyj-entity-creater"
        },
        "/workFlowApi": {
            enable: true,
            target: "http://127.0.0.1:8100/cyj-workflow"
        },
        "/userApi": {
            enable: true,
            target: "http://127.0.0.1:8100/cyj-entity-creater"
        },
        "/v1": {
            enable: true,
            target: "http://127.0.0.1:8100"
        }
    }
}));
