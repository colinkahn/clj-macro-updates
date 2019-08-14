# CLJ Macro Updates

## Issue

https://github.com/thheller/shadow-cljs/issues/495

This maybe a slightly different bug since the fix merged w/
https://github.com/thheller/shadow-cljs/commit/a21c3fcc42c48aef1d3734fe4c88936d51775e43
doesn't remedy this case.

## To reproduce

```
npx shadow-cljs watch :project
```

Once compiled run:

```
node ./out/project.core.js
```

This logs a map of the values found in `src/project/settings.clj`:

```
{:foo 1, :bar 2, :baz 3}
```

Edit and save some `def` value in  `src/project/settings.clj`. You'll see that
watch will not trigger. Running `node ./out/project.core.js` logs the same
result as before.
