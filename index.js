function* commands() {
    for (let i = 3; i <= 300; ++i) {
      const iStr = i.toString().padStart(3, '0');
      yield {
        'type': 'CreateElement',
        'data': {
          'elementType': 'b',
          'reference': `Related Element ${iStr}`,
          'name': `Related Element ${iStr}`,
  
          'attributes': {
            'reference': `Related Element ${iStr}`
          },
          'workspaceId': 1107
        }
      };
      yield {
        'type': 'CreateRelationship',
        'data': {
          'sourceReference': `Related Element ${iStr}`,
          'relationship': 'is target of',
          'targetReference': '1af66353-46c8-4b54-981a-47fb257014a7',
          'workspaceId': 1107
        }
      };
    }
  }
  
  console.log(
    JSON.stringify(
      Array.from(commands()),
      null,
      2
    )
  );